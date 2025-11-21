# Libro de Recetas (Java)

Ejemplo de implementación en Java que cumple los requisitos:

- Entidades: Ingrediente, Paso
- Receta (abstracta) y subclases: Postre (nivelDulce), PlatoFuerte (calorias), Bebida (alcohólica/no)
- LibroRecetas: Singleton que almacena recetas, permite agregar, listar y buscar por nombre
- RecetaFactory: Factory Method para crear instancias concretas según el tipo

Cómo compilar y ejecutar (Windows PowerShell):

```powershell
# Compilar
javac -d out src/recetas/*.java

# Ejecutar
java -cp out recetas.Main
```

Notas:
- Este proyecto usa paquetes (`package recetas`) y todos los archivos están en `src/recetas`.
- El `Main` contiene ejemplos de creación y uso del `LibroRecetas`.
