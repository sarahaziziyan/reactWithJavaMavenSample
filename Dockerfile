FROM airhacks/glassfish
COPY ./target/reactWithJavaSample.war ${DEPLOYMENT_DIR}
