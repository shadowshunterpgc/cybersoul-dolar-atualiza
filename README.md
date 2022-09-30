# Endpoint banco H2
usuario: sa \
senha: sa \
JDBC: jdbc:h2:~/cybersoul \
http://localhost:8080/h2-console

# API converte dolar para real e grava no banco na memória 
Grava valor do dolar na base

http://localhost:8080/dolar/converte?moeda=USD-BRL&quantidade=1

Grava diversas moedas na base

http://localhost:8080/currency/everything

# Converter o projeto de Maven para Gradle
gradle init --type pom

# Referências

Código de moedas do mundo

https://www.iban.com/currency-codes



