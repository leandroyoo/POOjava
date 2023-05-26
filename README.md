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



agora vamos aos relacionamentos 
---
aluno e turma 

segundo diagrama 

a classe turma  tem q conter no minimo um aluno

e a classe Aluno está em uma turma 

turma pode ter varios alunos então vou pegar varios objetos da classe
aluno e colocar na classe turma


se aluno tem uma turma 

então vou colocar um objeto da classe turma;


![image](https://github.com/leandroyoo/POOjava/assets/94478634/a39776ae-f8ca-400f-8487-5f39f049dadb)


                    então colocamos dentro de aluno um objeto(variavel) da classe turma 

