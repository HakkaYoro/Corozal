# 🇻🇪 Estructura del Proyecto: Corozal Mod (Fabric)

Este mod está siendo migrado de KubeJS a **Fabric (Java)**. A continuación se explica dónde va cada archivo y cómo se registran los nuevos elementos de comida y herramientas.

## 📂 Organización de Carpetas

La estructura sigue el estándar de Fabric para Java:

```text
Corozal/
├── src/main/java/corozal/
│   ├── Corozal.java                 # Clase principal (Punto de entrada)
│   ├── item/
│   │   └── ModItems.java            # Registro de todos los items (Arepas, Harina, etc.)
│   └── (otros paquetes)/            # Blocks, Entity, etc.
│
└── src/main/resources/
    ├── fabric.mod.json              # Configuración del mod
    └── assets/corozal/
        ├── lang/
        │   └── es_ve.json           # Nombres de los items (Arepa, Olla, etc.)
        ├── models/item/
        │   └── arepa.json           # Modelo JSON para que el item se vea en 2D
        └── textures/item/
            └── arepa.png            # La imagen real del item