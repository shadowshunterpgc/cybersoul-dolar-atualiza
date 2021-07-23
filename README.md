# Endpoint banco H2
usuario: sa \
senha: sa \
JDBC: jdbc:h2:~/cybersoul \
http://localhost:8080/h2-console

# API converte dolar para real e grava no banco na memória 
http://localhost:8080/dolar/converte?moeda=USD-BRL&quantidade=1

# Converter o projeto de Maven para Gradle
gradle init --type pom

