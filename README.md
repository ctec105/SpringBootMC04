# SpringBootMC04: Inyección de dependencias

La inyección de dependencias es fundamental en este framework.

- Los esterotipos sirven para crear un bean en el contenedor de Spring. Por lo tanto, se puede marcar cualquier clase con @Repository, @Service, @Controller, @Component. Pero se recomienda que los estereotipos se utilicen deacuerdo al contexto de las clases.
  - Acceso a datos = @Repository
  - Lógica de negocio = @Service
  - Controladores = @Controller
  - Clases utilitarias = @Component

- El objetivo del @Autowired es traer una instancia definida por algún estereotipo
  o definición de bean en algún lugar del proyecto.

- Y si tengo 2 implementaciones de una interfaz, se usa la anotación 
  @Qualifier("nombredelbean")
  

![](https://raw.githubusercontent.com/ctec105/SpringBootMC04/master/image.png)

# Herramientas:
- Spring Tool Suite 4
- Spring Boot 2.3.5