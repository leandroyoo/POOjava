# POOjava
Esse repositório e pra revisar os conteúdos aprendidos no curso de POO em Java vão me ajudar a recordar dos assuntos aprendidos para consultar quando necessário


Classe e Objetos
--

dado o time de futebol observe: 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/98de8ab0-38f7-48c0-b102-74d953e80e9e)



digamos que temos uma Classe jogador e nessa clase vamos ter seus respectivos atributos 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/259de015-4976-4da6-bed3-ba6d9dd1a592)

Classe x Objeto

Quando criamos um objeto ele é uma instancia da classe

então dado essa Classe jogador vamos ter os objetos 

Objeto Iniesta é uma objeto da classe jogador


Objeto Piqué é um objeto da classe jogador

![image](https://github.com/leandroyoo/POOjava/assets/94478634/748f952f-4851-42c8-867a-a2633335cf83)


ou seja a classe jogador define oque um objeto vai ter 

e um objeto é a classe tornada concreta 

          os objetos não são iguais pois tem valores diferentes porém eles são da mesma classe
          
          
          
.       
---

Diagrama de Classes
----
UML : linguagem de Modelagem Unificada



temos então na modelagem 4 Classes 


![image](https://github.com/leandroyoo/POOjava/assets/94478634/fbc901d0-2d9e-4e36-8103-089b14b81d59)




Relacionamento das Classes 
---

os relacionamentos são de dois tipos :

          Associação

          Herança(Generalização)

então fazemos essas perguntas 

TEM-UM ?

É-UM ?


dai temos 

TEM-UM = Associação


É-UM = Herança(Generalização)



O aluno tem uma turma!


         

![image](https://github.com/leandroyoo/POOjava/assets/94478634/017c66bd-c794-40c6-ad5c-a5ef35e9a4ae)

então vamos completando todos os demais 

O professor tem uma Disciplina!

O professor tem uma turma!

A turma tem uma Disciplina!


então podemos concluir que:


                    entre nessas classes só temos associações nesse momento
                    


Herança
---


A herança podemos associar a herança genetica

quando herdamos algumas coisa nós temos a herança das caracteristicas e dos comportamentos 

temos a classe mãe pessoa e dessa classe tem seus respctivos atributos (nome, matricula)

as subclasses professor e aluno herdam já dessa classe pessoas os atributos (nome, matricula)

![image](https://github.com/leandroyoo/POOjava/assets/94478634/5fc6bd24-5e41-44aa-9dab-9104a8f167a4)


                    se há atributos especificos eu coloco na subclasse se atributos comuns eu coloco na superclasse
                    
  toda associação tem uma multiplicidade

Multiplicidade 
---  
Multiplicidade:  quantidade de objetos de um lado que se associam com objetos do outro lado
                
                    
 ![image](https://github.com/leandroyoo/POOjava/assets/94478634/57dbe2c4-dd7d-4750-be0e-74722cc74317)
 
 Implementando o Código
 ---
                   
 observe que as pastas primeiramente eu fiz uma estrutura  em que 
 
 teremos uma pasta chamada escola que vai receber as classes  
 
 ![image](https://github.com/leandroyoo/POOjava/assets/94478634/466b8719-ea15-4f47-9c0e-884b0ae90cb2)


Classes
---
criaremos então as Classes 

classe Pessoa
--
  ![image](https://github.com/leandroyoo/POOjava/assets/94478634/7b7a3819-3ae3-4b68-8c33-3157c91cafd9)




importando o tipo date (tipo primitivo);
---
Quando vamos importar o tipo primitivo date precisamos fazer uma importação 

observe 
![image](https://github.com/leandroyoo/POOjava/assets/94478634/34d4b675-25ce-4ef5-93f4-acf20a326c76)


![image](https://github.com/leandroyoo/POOjava/assets/94478634/79cc495a-a717-4e87-89c9-f8448e26f8c8)



![image](https://github.com/leandroyoo/POOjava/assets/94478634/d089511f-10b4-4e08-82dc-5de27b77878d)



continuando a importar as classes: 

classe Aluno 
---

void quer dizer que nao faz nada 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/be151d7e-dacd-434c-853c-6ee1d23051a1)


classe Professor 
---

![image](https://github.com/leandroyoo/POOjava/assets/94478634/6779f071-1be5-43e5-917a-c369031a9ad7)

classe Disciplina 
--
![image](https://github.com/leandroyoo/POOjava/assets/94478634/ce6c5e43-6b55-4fd4-9199-1085bfad0df4)


classe Turma
--
![image](https://github.com/leandroyoo/POOjava/assets/94478634/b88ea46e-5cc6-40b8-b86b-37a8ffc0e924)


compare com o código 
--
compare no diagrama 
os metodos e atributos

![image](https://github.com/leandroyoo/POOjava/assets/94478634/bb923b0d-b850-40fb-9daf-264e81bff18e)

Conceitos de Herança
---

a Classe aluno herda de pessoas então teremos assim no codigo

o extends ![image](https://github.com/leandroyoo/POOjava/assets/94478634/7be01361-2233-408e-9498-d087a08fe83a)

![image](https://github.com/leandroyoo/POOjava/assets/94478634/9f60b7fe-6b48-4673-8af0-180c7762c90d)

e assim acontece em Professor 


![image](https://github.com/leandroyoo/POOjava/assets/94478634/f223dfc1-539f-4643-8860-925c84237890)



Conceitos de Associação
---
aluno e turma 

segundo diagrama:

![image](https://github.com/leandroyoo/POOjava/assets/94478634/57e0ec18-6ef9-41f7-af18-91fbd2239b1b)


                    a classe turma  tem q conter no minimo um aluno e a classe Aluno está em uma turma 
                    
Aluno tem uma turma: 

                     então colocamos dentro de aluno um objeto(variavel) da classe turma 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/a39776ae-f8ca-400f-8487-5f39f049dadb)


                   
                    
                    
                   

A turma pode ter varios alunos:

                    então vou pegar varios uma lista da classe aluno e colocar na classe turma
                  
![image](https://github.com/leandroyoo/POOjava/assets/94478634/fcfe9c36-cea1-40eb-bcfa-a270f9198f38)


Professor e Disciplina 


professor pode ter quantas disciplinas ? várias

então dentro de professor vai ter uma lista de disciplinas 



![image](https://github.com/leandroyoo/POOjava/assets/94478634/9a8d3e53-2da4-4165-9af9-d93f9bf25e42)



uma disciplina pode ter quantos professores ? varios

entao dentro de disciplina vamos ter uma lista de professores

![image](https://github.com/leandroyoo/POOjava/assets/94478634/2da34397-d38a-4416-99d8-35fe66842089)

 
 
 
 
 Professor e Turma
 
 Um professor pode lecionar em quantas turmas ? várias 
 
 então dentro de turma vamos ter uma lista de professores
 
 ![image](https://github.com/leandroyoo/POOjava/assets/94478634/66bf88b8-fa06-4bd3-9b38-adee8b4a361e)

 
 
 
 Uma turma pode ter quantos professores ? vários!

então dentro de professores vamos ter uma lista de turmas 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/d4aa02c1-b20d-4f81-9dc5-22bc3258f49f)



Disciplina e Turma 


uma disciplina pode ser ministrada em quantas turmas ? várias !

então dentro de disciplina vamos ter uma lista de turmas 


![image](https://github.com/leandroyoo/POOjava/assets/94478634/d9e66d83-f04c-48e8-8b14-0035e3595216)



uma turma pode ter quantas disciplinas ? várias!

então dentro de turma vamos ter uma lista de disciplinas


![image](https://github.com/leandroyoo/POOjava/assets/94478634/d0552d0e-04ea-4929-96fc-03fdfa3a091e)




Criação de Objetos e Encapsulamento
--

![image](https://github.com/leandroyoo/POOjava/assets/94478634/9b42c33d-3d6d-4819-b9b8-38098ce15ece)


vamos criar os objetos 

abrindo a classe EscolaPoo

ao instanciar uma disciplina1 que será cadastrada como matematica na podemos esquecer 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/37487a5b-1e7d-4629-8d3e-e92f62ef1ef2)


eu tenho que ir na classe disciplina e declarar suas variaveis como public ![image](https://github.com/leandroyoo/POOjava/assets/94478634/d594dbb1-0bf7-44f3-b865-6f01df0750e3)




![image](https://github.com/leandroyoo/POOjava/assets/94478634/64b85c8d-4f45-4411-b6dc-ed45f3d109a7)



ai então o erro desaparece

![image](https://github.com/leandroyoo/POOjava/assets/94478634/0700d5fc-dd5b-447d-90aa-11bfff58ea1a)



quando tentamos inserir um dado que esteja errado mas esteja no publico ela vai aceitar ![image](https://github.com/leandroyoo/POOjava/assets/94478634/3963a106-95dd-401f-a8a3-527ee6dd9f77)

pois nao existe cargaHoraria negativa numa disciplina

observe

![image](https://github.com/leandroyoo/POOjava/assets/94478634/ff81ff7b-cefb-40f0-ac84-20c0246ae09a)


pra que isso nao ocorra vamos tornar o tipo da classe privada ![image](https://github.com/leandroyoo/POOjava/assets/94478634/9582cc7a-1617-49c4-9680-d5013c7973cf)


![image](https://github.com/leandroyoo/POOjava/assets/94478634/9fdb68c7-32a2-4536-87bf-fff4aea1d937)



só que agora teremos um erro 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/4b067266-89b7-4421-8bf6-eb234dc74157)



Representação Explicativa dos Métodos GET e SET


menina bonita

amiga feia que ajuda com a busca dos dados

kkkkkkkk

GET pegar
SET setar

![image](https://github.com/leandroyoo/POOjava/assets/94478634/4b8522cd-6ef5-4bca-9fcb-73dd28c6f124)


então vamos em disciplina escolhemos o get e set

![image](https://github.com/leandroyoo/POOjava/assets/94478634/5a0ab9b8-05f4-4a82-8c22-685e35336f4b)


selecionamos nome e cargahoraria

![image](https://github.com/leandroyoo/POOjava/assets/94478634/3fb8a1b2-6d6f-4c13-9512-86ab24e9abc2)

teremos algo parecido com isso

![image](https://github.com/leandroyoo/POOjava/assets/94478634/07b4387f-6926-441e-9694-53dc71063499)


agora em escolaPoo

temos que declarar assim ![image](https://github.com/leandroyoo/POOjava/assets/94478634/1cbe4bfd-282a-419a-bcb9-fc5020c8dc8e)

e teremos algo parecido com isso

![image](https://github.com/leandroyoo/POOjava/assets/94478634/3f26d6eb-9ac2-483e-b207-def0dcb7b99d)


e imprimindo os dados ![image](https://github.com/leandroyoo/POOjava/assets/94478634/02ef0546-1004-4ff0-9956-886ccb92a8af)

vamos ter esse resultado  ![image](https://github.com/leandroyoo/POOjava/assets/94478634/a47ecccc-7754-49cf-880b-9dbffd28ce9f)

Método SET
---

tá bom Leandro mas a ideia dos encapsulamento nao é proteger os dados ??? então porque continuam sendo aceitos ???

vamos entender o código 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/fea8ef15-314a-4840-97b0-6a9dd67f3df9)


"esse" . objeto que chamou o setNome  vai ter o atributo nome

e setNome recebe o parametro(String nome) ![image](https://github.com/leandroyoo/POOjava/assets/94478634/18e1fca6-cbcc-48ff-a0f6-0677d774b5af)


mas que é o set nome ?? 


é esse ![image](https://github.com/leandroyoo/POOjava/assets/94478634/a8cdbecd-e2be-4598-ab36-f2337d448f53)



então o atributo this.nome vai passar pra variavel o valor que pegou  ![image](https://github.com/leandroyoo/POOjava/assets/94478634/7df2ce86-3c68-4fe8-8ed6-ec4c9d016507)

observando o objeto instanciado 
         ![image](https://github.com/leandroyoo/POOjava/assets/94478634/9d2152ca-8f74-459c-992e-9afd7b6ec2d0)
           
                    
                    
      no caso o objeto disciplina1 vai usar o setNome e pegar "esse" atributo =  this.nome  
      e vai jogar na variavel em nome = "matematica" 

Protegendo um valor
---
mesma coisa será em cargahoraria 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/1e7e8ea8-a83f-4d13-a86f-5b19cfa00524)


mas digamos que eu nao quero aceitar carga horaria negativa eu adiciono um if 

ou seja set a cargaHora se o valor for maior ou igual a 0 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/058172c5-4cec-4935-aaa9-1efc5ae4de88)


ai quando tivermos uma inserção de um atributo com o valor negativo

![image](https://github.com/leandroyoo/POOjava/assets/94478634/1132d725-4f0e-4969-b90a-88becb6562f2)



ele transformará em 0 observe ![image](https://github.com/leandroyoo/POOjava/assets/94478634/5d96f5e7-3846-45e3-b741-628be766c65d)



