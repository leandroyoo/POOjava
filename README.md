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

Modificadores de Acesso:

![image](https://github.com/leandroyoo/POOjava/assets/94478634/9b42c33d-3d6d-4819-b9b8-38098ce15ece)


vamos criar os objetos 

abrindo a classe EscolaPoo

ao instanciar uma disciplina1 que será cadastrada como matematica nao podemos esquecer 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/37487a5b-1e7d-4629-8d3e-e92f62ef1ef2)


eu tenho que ir na classe disciplina e declarar suas variaveis como public ![image](https://github.com/leandroyoo/POOjava/assets/94478634/d594dbb1-0bf7-44f3-b865-6f01df0750e3)


declare as variaveis como public

![image](https://github.com/leandroyoo/POOjava/assets/94478634/64b85c8d-4f45-4411-b6dc-ed45f3d109a7)



ai então o erro desaparece

![image](https://github.com/leandroyoo/POOjava/assets/94478634/c392636d-be98-456d-b935-30cf5e6438d8)


mas ai temos um problema!

quando tentamos inserir um dado que esteja errado mas esteja no publico ela vai aceitar ![image](https://github.com/leandroyoo/POOjava/assets/94478634/3963a106-95dd-401f-a8a3-527ee6dd9f77)

pois nao existe cargaHoraria negativa numa disciplina

observe

![image](https://github.com/leandroyoo/POOjava/assets/94478634/ff81ff7b-cefb-40f0-ac84-20c0246ae09a)


pra que isso nao ocorra vamos tornar o tipo da classe privada ![image](https://github.com/leandroyoo/POOjava/assets/94478634/9582cc7a-1617-49c4-9680-d5013c7973cf)

observe 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/9fdb68c7-32a2-4536-87bf-fff4aea1d937)



só que agora teremos um erro 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/4b067266-89b7-4421-8bf6-eb234dc74157)

ai entra os

Métodos GET e SET
----

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

tá bom Leandro mas a ideia dos encapsulamento nao é proteger os dados ??? então porque continuam sendo aceitos ???

vamos entender o código 


mesma coisa será em cargahoraria 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/1e7e8ea8-a83f-4d13-a86f-5b19cfa00524)


mas digamos que eu nao quero aceitar carga horaria negativa eu adiciono um if 

ou seja set a cargaHora se o valor for maior ou igual a 0 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/058172c5-4cec-4935-aaa9-1efc5ae4de88)


ai quando tivermos uma inserção de um atributo com o valor negativo

![image](https://github.com/leandroyoo/POOjava/assets/94478634/1132d725-4f0e-4969-b90a-88becb6562f2)



ele transformará em 0 observe ![image](https://github.com/leandroyoo/POOjava/assets/94478634/5d96f5e7-3846-45e3-b741-628be766c65d)

que seria o nulo no caso pois tecnicamente esse dado nao foi aceito no metodo

Associação de Objetos: um para muitos
---
Como eu associo um objeto com um objeto ?

Aluno e Turma 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/bce7df7d-1826-458f-a9f1-d31663a083b3)


Aluno 


transformo os dados associados em private 


![image](https://github.com/leandroyoo/POOjava/assets/94478634/7fdbf27a-b6fc-40c4-bfd5-717933f791c6)



crio os metodos get e set 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/eb66b988-8ba7-499a-917e-c6081f1bdf50)



ai então vamos agora em Pessoas

![image](https://github.com/leandroyoo/POOjava/assets/94478634/6368623c-178b-4b99-a97f-ca3fca2304fe)



e fazemos o mesmo procedimento de tornar private e criar os metodos get e set 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/4c108bdb-aa1b-49eb-b05c-acdc2b80ad64)


Agora como colocamos uma turma dentro de um aluno ???


vamos criar outra classe chamada associação para um ![image](https://github.com/leandroyoo/POOjava/assets/94478634/5202ed07-d771-4ec6-9cc2-7e99c9004eb3)

![image](https://github.com/leandroyoo/POOjava/assets/94478634/b681b32f-2df5-470f-8bc2-d886eab61b92)


beleza agora vamos intanciar uma classe turma

![image](https://github.com/leandroyoo/POOjava/assets/94478634/f7551707-0865-42af-864c-e307c53449be)

lá em turma vamos ter os seguintes dados 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/1c189959-9bd7-4e19-83bd-bfebc5d62766)


agora vamos tornar private os dados

![image](https://github.com/leandroyoo/POOjava/assets/94478634/d6405c4e-523e-4c5b-a9f0-0c895463b4ff)


agora vamos criar os metodos get set 

na classe Turma

só que agora vamos selecionar apenas oqs que nao são arrays 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/52b2ded5-dc1d-4a97-a2a6-87897b03623a)

então vamos ter algo similar a isso 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/4d0f5e35-4c55-470f-b897-6e848c8fb374)


agora que criamos as conexões com os metodos get e set 

podemos então na classe de associação vamos criar uma turma

![image](https://github.com/leandroyoo/POOjava/assets/94478634/b4e63bc2-c1a2-4f8e-9c9f-77f836de39be)

e também vamos criar um aluno 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/3d46d321-9cdb-4828-b1d4-bed7ece2c6ba)

mas agora observe que em aluno temos um espaçozinho para armazenar a turma 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/43873159-9ad3-4544-bd7c-74dd9b321cd3)


representação

![image](https://github.com/leandroyoo/POOjava/assets/94478634/7d132b05-1dbe-4313-8192-8df1d5c6bd0d)


então vamos pegar o obejeto aluno e associar a turma 

associando um objeto ao outro
---

Dessa forma eu consigo acessar todas as informações daquele objeto

associando utilizando uma referencia

![image](https://github.com/leandroyoo/POOjava/assets/94478634/480e7d16-4d0c-42aa-b669-368332dc3e43)



associando utilizando uma referencia ![image](https://github.com/leandroyoo/POOjava/assets/94478634/d1e3d958-89a4-4577-a8c1-811a46ab6f15)



então vamos criar pelo menos 2 alunos nessa turma

![image](https://github.com/leandroyoo/POOjava/assets/94478634/58379e17-b8a3-4f33-91d7-6fa4f03264b6)

mas eai leandro qual a vantagem disso ????

a vantagem é que teremos como pegar os dados especificos do objeto

observe que nesse caso ao acessar a classe turma eu só queira pegar a sigla

![image](https://github.com/leandroyoo/POOjava/assets/94478634/03a530a5-c00b-4d05-83b8-aaf2cff82df0)


olha o resultado que obteremos

![image](https://github.com/leandroyoo/POOjava/assets/94478634/8b2ded50-780c-4315-8f91-7a46cd382f65)



Associação de Objetos: um para muitos: um pra muitos
---

representação 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/263dc706-00f9-46b6-ade9-b4cfc95e6e72)





o aluno possui uma turma e a turma pode ter vários alunos 

1 --* 


na classe Aluno 

colocamos um objeto da classe Turma

![image](https://github.com/leandroyoo/POOjava/assets/94478634/68aa6f64-36b6-4627-ae03-b22acc388cf0)


e na classe Turma colocamos uma lista da classe Alunos


![image](https://github.com/leandroyoo/POOjava/assets/94478634/1d5dc3bf-e771-459c-a31d-c595e4a2ea42)


se observamos nós criamos uma turma 
e dois alunos

fizemos apenas a associação do aluno TEM-TURMA 


![image](https://github.com/leandroyoo/POOjava/assets/94478634/82d45d01-1bd0-4963-b671-5c9d9b61c4ce)

Manipulando uma  lista
---
agora vamos associar o outro lado da associação a turma tem alunos ???

para manipular a lista que tem na classe de Turma..![image](https://github.com/leandroyoo/POOjava/assets/94478634/82f8eebd-4c60-4c89-aa7b-bdf1082af267)


Vamos Criar 4 Métodos esse 4 métodos nos permitirão manipular essas lista

esses metodos permitirao 


metodo de adicionar um aluno na lita 
---
adicionarAluno vai receber (da Classe Aluno um objeto aluno) ![image](https://github.com/leandroyoo/POOjava/assets/94478634/35b737de-7519-45db-8e5d-bc2f58b0fbde)

então eu vou add (adicionar) um aluno na lista de alunos 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/7bbb61bf-92ae-4f38-b913-9ee2fdbe545a)




metodo  ver o tamanho (quatidade) de alunos na lista 
---
se eu quero saber o tamanho então ele vai me retornar um valor inteiro 

O size() em Java é um método predefinido da classe ArrayList. É usado para calcular o número de objetos em um ArrayList .

![image](https://github.com/leandroyoo/POOjava/assets/94478634/b3bb5bc8-ba82-4ce6-adf6-1de97c11ca71)



metodo  excluir dum alunos da lista 
---
como eu quero saber qual aluno eu vou remover 
tenho que passar o parametro do aluno ![image](https://github.com/leandroyoo/POOjava/assets/94478634/b0baee1e-915f-41be-a01e-35cb06149fb9)
 
 
O método remove() usa a implementação padrão do método equals() , do objecto a remover, para verificar se ele existe no ArrayList.


![image](https://github.com/leandroyoo/POOjava/assets/94478634/8ca340b2-0f9a-48e5-95f1-e9f9adad4637)



metodo de pegar um aluno 
---
pegar um aluno eu posso informar qual a posição desse aluno 

então para pegar eu informo qual posição que eu quero 

então eu pego o aluno pela sua posição 

ou seja tendo acesso a posição eu consigo pegar cada objeto aluno da lista

representação 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/02c15da0-3df0-4b51-87a0-e20c8843a25b)


o metodo retorna um objeto da classe aluno eu tenho que apontar a classe "public Aluno" 
e vai receber a posição de valor inteiro do aluno na lista "pegarAluno(int posicao)" ![image](https://github.com/leandroyoo/POOjava/assets/94478634/26a17b68-e22f-40fd-b6e2-7959c3fce993)


usando o metodo get ele pega/retorna o valor da posicao ![image](https://github.com/leandroyoo/POOjava/assets/94478634/9208c7b9-8250-4e8e-9e4a-7d3f0991b8de)


então ficará assim a metodo pegar aluno 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/c8131404-7d77-4db7-9088-2337609d1380)

criando a lista no código
---

a lista qunado está declarada assim ela esta nula ou seja nao foi criada ![image](https://github.com/leandroyoo/POOjava/assets/94478634/e327e5e2-fc74-49f1-ab92-be4f0db389cb)


então nós temos que criar ela temos duas maneiras 

maneira 1 
![image](https://github.com/leandroyoo/POOjava/assets/94478634/52b76479-957e-46c3-9a42-8e99d31b1f09)

maneira 2 

metodo construtor 

implicitamente toda classe ja tem um metodo construtor vazio e nós podemos escrever

ao invocar o metodo construtor ele cria uma lista

![image](https://github.com/leandroyoo/POOjava/assets/94478634/314bd157-15b7-4e53-b018-d8a60325f82d)


agora como vamos associar 
---

desta maneira quando vamos criar nosso objeto aluno podemos associar ele ![image]![image](https://github.com/leandroyoo/POOjava/assets/94478634/3b7a99bb-450b-462c-a9d5-02abad01fc2c)

pois ai já temos a associação bidirecional

observe : 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/6abd2a98-9003-4a9e-80b8-858c864b228b)


entendendo a associação bidirecional
---

temos o objeto aluno 

![image](https://github.com/leandroyoo/POOjava/assets/94478634/ad961ac4-2a58-4f1a-a46c-d98eb661cb18)

quando inserimos o objeto(aluno1) sabemos que ele ja faz parte do objeto(turma1) ![image](https://github.com/leandroyoo/POOjava/assets/94478634/389faa1e-2eab-43ce-9b39-e5df1695ce5c)

mas na turma1 precisamos apontar a associação pelo o objeto(aluno1)  ![image](https://github.com/leandroyoo/POOjava/assets/94478634/f7347eeb-4479-4276-ae8f-e38c9eee8eb9)

e assim funciona também para o objeto(aluno2)

representacao

![image](https://github.com/leandroyoo/POOjava/assets/94478634/9040f995-5e75-4a17-b48e-3dc28eb8b943)

          e assim concluimos os dois lados da associação bidirecional 


















