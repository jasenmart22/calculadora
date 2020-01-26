# Pasos para generar jar de calculadora y ejecutarlo por consola
1. En la carpeta del proyecto instalar el jar tracer en repositorio local de maven:
   mvn install:install-file -Dfile=lib/tracer-1.0.0.jar -DgroupId=io.corp.calculator -DartifactId=tracer -Dversion=1.0.0 -Dpackaging=jar
2. limpiar target, compilar y empaquetar el proyecto:
   mvn clean package	
3. En carpeta target ejecutar jar generado:
   java -jar calculadora-0.0.1-SNAPSHOT.jar
4. En un browser probar las siguientes urls de ejemplo:
   -para sumar 5 y 3: http://localhost:8082/calculadora/sumar/5/3    
   -para restar 5 y 3: http://localhost:8082/calculadora/restar/5/3

