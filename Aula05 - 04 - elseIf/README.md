# aprendendo sobre else if

## incluindo novas perguntas no else de cada if

> n�o h� limites em rela��o a aumentos de codi��es em ifs, por�m deve ter cuidado com a quantidade
> pois fica a perguntas (n�o seria melhor um switch ?)
>
> por�m quando utilizandos else if() 
> se faz necess�rio fechar essa cadeia com um else final, por quest�es de boas pr�ticas


````java
if(condicao1){
  // se atender a condi��o 1
}else if(condicao2){ // so entra aqui se atender a condi��o
 // se atender a condi��o 2
}else if(condicaoN){ // so entra aqui se atender a condi��o
 // se atender a condi��o N
}else{ // seria a condi��o que sobrou
 //pode ter alguma a��o, mas mesmo que n�o tenha escreva mesmo assim
}
````