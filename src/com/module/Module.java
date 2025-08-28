package com.module;

/**
 *
 * @author rolan
 * @description dicha interface será la base para el modelado de uso de los
 * módulos de la app
 */
import javax.swing.*;

public interface Module {

    String getKey();     // clave única ("ventas", "inventario", ...)

    String getTitle();   // "MÓDULO DE VENTAS"

    Icon getIcon();      // icono del módulo (no del botón)

    JPanel getPanel();   // vista principal (normalmente un JPanel)

    default void onShow() {
    }  // llamado cuando se muestra

    default void onHide() {
    }  // llamado cuando se oculta
}
