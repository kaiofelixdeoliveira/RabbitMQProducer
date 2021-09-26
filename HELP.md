# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.5/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#using-boot-devtools)
* 

###MESSAGE BROKERS
FAZ O GERENCIAMENTO DAS FILAS E MENSAGENS, COMO AÇÕES DE EXLUIR, INCLUIR, ALTERAR ETC

##TECNOLOGIAS QUE IMPLEMENTAM O MESSAGE BROKER
RABIIT MQ
ACTVEMQ
APACHE KAFKA
IBM MQ

##PROTOCOLO MAIS USADO PELAS TECNOLOGIAS
AMQP

##ALGUNS CONCEITOS UTILIZADOS NA COMUNICAÇÃO
bROKERS - FAZ O GERENCIAMENTO DA MENSAGENS DURANTE TODO O CICLO DE ENTRADA ATÉ A SAIDA.
TOPICOS  -UTILIZADO PARA A ASSINATURA DE UMA DETERMINADA APLICAÇÃO SEJA COMO CONSUMIDOR OU PRODUTOR. 
CONSUMIDORES - APLICAÇÃO QUE CONSOME A AS MENSAGENS DA FILA
PRODUTORES - APLICAÇÃO QUE ENVIA A MENSAGEM PARA A FILA
BINDINGS - FAZ A LIGAÇÃO ENTRE O EXCHANGE E AS FILAS
EXCHANGE  -DECIDE PARA QUUAL FILA A MENSAGENS VAI SER ENVIADA
EVENTOS-AS PROPRIAS MENSAGENS EM SI
FILAS-ONDE OS EVENTS FICAM ENFILEIRADOS

##TIPOS DE EXCHANGE
DIRECT  -SÓ IRÃO RECEBER AS MENSAGENS QUEM TEM A MESMA CHAVE(ROUTING KEY)
FANOUT- Todas as queues ligadas a exchange receberão as mensagens
TOPIC - 
HEADER -
