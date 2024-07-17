package edu.ecu.ec.ProyectoEmprendimiento.View;

import edu.ecu.ec.ProyectoEmprendimiento.Coneccion.ProductService;
import edu.ecu.ec.ProyectoEmprendimiento.Models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

@Component
public class Inventario extends JFrame {

    @Autowired
    private ProductService productService;

    private DefaultTableModel tableModel;

    public Inventario() {
        initComponents();
        centerFrame();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        agregarButton = new javax.swing.JButton();
        actualizarButton = new javax.swing.JButton();
        buscarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        mostrarButton = new JButton("Mostrar");
        idEliminarField = new JTextField(10);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventario");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel1.setText("Lista de productos");

        tableModel = new DefaultTableModel(
                new Object[][]{},
                new String[]{"ID", "Nombre", "Precio", "Stock"}
        );

        jTable1.setModel(tableModel);
        jScrollPane1.setViewportView(jTable1);

        agregarButton.setText("Agregar");
        agregarButton.setActionCommand("agregarButton");

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog(Inventario.this, "Ingrese el nombre del producto:");
                String precioStr = JOptionPane.showInputDialog(Inventario.this, "Ingrese el precio del producto:");
                String stockStr = JOptionPane.showInputDialog(Inventario.this, "Ingrese el stock del producto:");

                try {
                    double precio = Double.parseDouble(precioStr);
                    int stock = Integer.parseInt(stockStr);
                    Products nuevoProducto = new Products(nombre, precio, stock);
                    productService.createProduct(nuevoProducto);
                    cargarProductos(); // Actualizar la tabla después de agregar un producto

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Inventario.this, "Error: Ingrese un número válido para precio y stock.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        actualizarButton.setText("Actualizar");
        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idActualizarStr = JOptionPane.showInputDialog(Inventario.this, "Ingrese el ID del producto a actualizar:");
                if (idActualizarStr != null && !idActualizarStr.isEmpty()) {
                    try {
                        long idActualizar = Long.parseLong(idActualizarStr);
                        String nombre = JOptionPane.showInputDialog(Inventario.this, "Ingrese el nuevo nombre del producto:");
                        String precioStr = JOptionPane.showInputDialog(Inventario.this, "Ingrese el nuevo precio del producto:");
                        String stockStr = JOptionPane.showInputDialog(Inventario.this, "Ingrese el nuevo stock del producto:");

                        try {
                            double precio = Double.parseDouble(precioStr);
                            int stock = Integer.parseInt(stockStr);
                            Products productoActualizado = new Products(nombre, precio, stock);
                            productService.updateProduct(idActualizar, productoActualizado);
                            cargarProductos(); // Actualizar la tabla después de actualizar el producto
                            JOptionPane.showMessageDialog(Inventario.this, "Producto actualizado correctamente.", "Actualizar Producto", JOptionPane.INFORMATION_MESSAGE);

                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(Inventario.this, "Error: Ingrese un número válido para precio y stock.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(Inventario.this, "Error: Ingrese un número válido para el ID.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(Inventario.this, "Ingrese el ID del producto a actualizar.", "Actualizar Producto", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        buscarButton.setText("Buscar");

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idEliminarStr = JOptionPane.showInputDialog(Inventario.this, "Ingrese el ID del producto a eliminar:");
                if (idEliminarStr != null && !idEliminarStr.isEmpty()) {
                    try {
                        long idEliminar = Long.parseLong(idEliminarStr);
                        productService.deleteProduct(idEliminar);
                        cargarProductos(); // Actualizar la tabla después de eliminar el producto
                        JOptionPane.showMessageDialog(Inventario.this, "Producto eliminado correctamente.", "Eliminar Producto", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(Inventario.this, "Error: Ingrese un número válido para el ID.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(Inventario.this, "Ingrese el ID del producto a eliminar.", "Eliminar Producto", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarProductos();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(actualizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(agregarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(buscarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(eliminarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(mostrarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(idEliminarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(eliminarButton)))))
                                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(agregarButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(actualizarButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(buscarButton)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(idEliminarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(eliminarButton))
                                                .addGap(18, 18, 18)
                                                .addComponent(mostrarButton)))
                                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }

    private void centerFrame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
    }

    private void cargarProductos() {
        if (productService == null) {
            System.err.println("ProductService is null. No se pueden cargar productos.");
            return;
        }

        tableModel.setRowCount(0);
        List<Products> productos = productService.getAllProducts();
        for (Products producto : productos) {
            Object[] row = {
                    producto.getId(),
                    producto.getName(),
                    producto.getPrice(),
                    producto.getStock()
            };
            tableModel.addRow(row);
        }
    }

    private javax.swing.JButton actualizarButton;
    private javax.swing.JButton agregarButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JButton mostrarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField idEliminarField;
}
