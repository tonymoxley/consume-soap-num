## **Spring Boot - Consuming a SOAP Service**
Este proyecto tiene como objetivo crear un servicio REST simple que se comunicará con un servicio SOAP existente, para convertir un numero simple en palabras.

### Descripcion de los flujos
La version de este proyecto(1.0.0-SNAPSHOT), contiene los siguientes flujos:

* GET -> /api/v1/number/conversion/words/{number} : convierte un numero simple en palabras.

### Dependecias maven
Estas son las dependecias importantes a considerar en el proyecto para comunicarse con un servicio SOAP.
#### Properties generales:
```xml
<properties>
    <java.version>1.8</java.version>
    <maven.jaxb2.version>0.14.0</maven.jaxb2.version>
</properties>
```
#### SOAP y WSDL :
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web-services</artifactId>
    </dependency>
    <dependency>
        <groupId>wsdl4j</groupId>
        <artifactId>wsdl4j</artifactId>
    </dependency>
</dependencies>
```
#### Plugin para generar los modelos del WSDL:
```xml
<plugin>
    <groupId>org.jvnet.jaxb2.maven2</groupId>
    <artifactId>maven-jaxb2-plugin</artifactId>
    <version>${maven.jaxb2.version}</version>
    <executions>
        <execution>
            <goals>
                <goal>generate</goal>
            </goals>
        </execution>
    </executions>
    <configuration>
        <schemaLanguage>WSDL</schemaLanguage>
        <generateDirectory>${project.basedir}/src/main/java</generateDirectory>
        <generatePackage>org.arkham.examples.soap.model.gen</generatePackage>
        <schemaDirectory>${project.basedir}/src/main/resources</schemaDirectory>
        <schemaIncludes>
            <include>files/numbers.wsdl</include>
        </schemaIncludes>
    </configuration>
</plugin>
```
Nota: para generar las clases de manera automatica, se debe colocar en el tag de: ***generatePackage*** la ruta de los paquetes java
en donde se generarán las clases del WSDL, y por último en el tag de: ***schemaIncludes ->  include*** colocar la ruta y nombre del archivo WSDL.

### Configuración local
Antes de ejecutar el proyecto se deben instalar las dependencias maven, ya sea mediante el IDE de su preferencia o mediante la consola del
sistema operativo -> navegar hacia la carpeta del proyecto y ejecutar los comandos:
```shell
mvn clean install
```
en caso de un error forzar las dependencias maven:
```shell
mvn clean install -U
```
Nota: En caso de otro error en el proyecto, mediante el IDE limpiar el proyecto, construirlo y cargar nuevamente las dependencias maven.

Para generar las clases de manera automatica con el plugin, se deberán eliminar las clases del paquete java-
***org.arkham.examples.soap.model.gen***, y ejecutar el siguiente comando maven:
```shell
mvn compile
```

### Ejecución del proyecto
Si todo compila correctamente, seleccionar el proyecto desde el IDE hacer clic secundario > ejecutar como proyecto spring boot,
o mediante la terminal > navegar hacia la carpeta del proyecto y ejecutar el comando:
```shell
mvn spring-boot:run
```
### Detalles técnicos
+ Este proyecto está construido en Java 1.8
+ Es un proyecto de Spring Boot 2.7.6
+ Se utiliza maven como gestor de dependencias

### Reference Documentation
* https://www.baeldung.com/spring-soap-web-service
* https://leiva.io/2019/12/29/invocar-servicios-soap-desde-spring-boot/

### :hammer_and_wrench: Languages and Tools :
<div>
<img src="https://github.com/devicons/devicon/blob/master/icons/java/java-original-wordmark.svg" title="Java" alt="Java" width="40" height="40"/>&nbsp;
<img src="https://github.com/devicons/devicon/blob/master/icons/spring/spring-original-wordmark.svg" title="Spring" alt="Spring" width="40" height="40"/>&nbsp;
<img src="https://github.com/devicons/devicon/blob/master/icons/git/git-plain.svg" title="Spring" alt="Git" width="40" height="40"/>&nbsp;
</div>
