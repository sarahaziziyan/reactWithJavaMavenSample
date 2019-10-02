# Build
mvn clean package && docker build -t com.mycompany/reactWithJavaSample .

# RUN

docker rm -f reactWithJavaSample || true && docker run -d -p 8080:8080 -p 4848:4848 --name reactWithJavaSample com.mycompany/reactWithJavaSample 