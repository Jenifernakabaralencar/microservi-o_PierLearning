# in the code

## Explain

### explicar o módulo/projeto hr-worker
    - depenências (data-jpa, web, h2)
    - camadas (entities, repository, controller)
        * findAll
        * findById
            Logger a ser explicado depois
    - application.properties
        * nome
        * porta
        * configuração h2
    - extras
        * data.sql

### explicar o módulo/projeto hr-payroll
    - depenências (web)
    - camadas (entities, service, controller)
        * Payment - sem persistência; getTotal: calculo em runtime
        * Worker - é a cópia do hr-worker; haverá comunicação 
    - applications.properties
        * nome
        * porta

## Microssevices I

### hr-payroll - steps

1) dependências: descomentar o <b>feign</b> e </b>spring cloud</b>
2) atualizar projeto
3) habilitar o feign na aplicação (@EnableFeignClients)
    - isso permite o uso do feign para fazer comunicação com outras applicações (APIs ou Serviços)
    - aplicação consumidora
4) criar interfaces dos feign clients
    - interfaces que tem métodos correspondentes aos serviços que iremos consumir
    - @Component
    - @FeignClient
    - Cada método deve ter a mesma declaração do que iremos usar do outro serviços, independente da linguagem
5) executar os projetos e testar
    - acessar h2 do worker http://localhost:3001/h2-console
    - find-all, find-by-id, get-payment
    - implementar o getPayment
    - executar request get-payment; temos comunição, mas não temos microsserviços
6) reexplicar características de microsserviços
    - endereço físico
    - acoplamento (auto scalinng, load balancer)
7) configurar eureka
    - fechar e para tudo!
    - criar um novo projeto (spring initializer)
    - importar como projeto (novo módulo) maven
    - mudanças no pom.xml
        - versão -> 2.3.4.RELEASE
        - versão do spring-cloud -> Hoxton.SR8
        - dep -> org.glassfish.jaxb
    - @EnableEurekaServer
    - application.properties
        - name
        - port
        - forçar o módulo ser apenas um server
8) configurar os clients
    - descomentar dependência: eureka-client
    - application.properties
        - endereço do eureka server
    - @EnableEurekaClient
        - worker
        - payroll
            - remover "url" da interface feign client
9) executar os projetos
    - hr-eukera-server
        - http://localhost:8761/eureka
    - hr-worker
    - hr-payroll
    - testar
10) aplicar configurações no worker
    - testar

    