# perguntas-logica
Respostas de perguntas de lógica e estrutura de dados para vaga de estágio 

1) Observe o trecho de código abaixo: 

 	int INDICE = 13, SOMA = 0, K = 0; 

 	enquanto K < INDICE faça 

	{ 

		K = K + 1; 

		SOMA = SOMA + K; 

	} 

 	imprimir(SOMA); 

  

Ao final do processamento, qual será o valor da variável SOMA? 

<b> Resposta: 
- O trecho de código apresenta um laço de repetição while. Inicialmente, temos INDICE = 13, SOMA = 0 e K = 0. O programa incrementa K até que ele seja igual a INDICE, somando o valor de K à variável SOMA a cada iteração. Portanto, o resultado final da variável SOMA será a soma dos números de 1 a 13, que é 91 </b>
  

 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. 

  

IMPORTANTE:  

	Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código; 

   

3) Descubra a lógica e complete o próximo elemento:  

   

a) 1, 3, 5, 7, <b> 9</b> <i> soma de 2 </i>

b) 2, 4, 8, 16, 32, 64, <b> 128</b>  <i> multiplica 2 </i>

c) 0, 1, 4, 9, 16, 25, 36, <b> 49</b>  <i> eleva ao quadrado </i>

d) 4, 16, 36, 64, <b>100</b>  <i> Entre 4 e 16, adicionamos 12 unidades; Entre 16 e 36, adicionamos 20 unidades; Entre 36 e 64, adicionamos 28 unidades. Logo, de 64 para o próximo tem 36 unidades de diferença. 64 + 36 = 100 </i>

e) 1, 1, 2, 3, 5, 8, <b>13</b>  <i> cada termo é a soma dos dois antecessores</i>

f) 2,10, 12, 16, 17, 18, 19, <b>20</b>  <i> todos os números nessa sequência iniciam com a consoante "d" </i>

   

4) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.

Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?  

<b>Resposta:
   - Primeira ida: Liga o primeiro interruptor, desliga o primeiro interruptor, liga o segundo interruptor
   - Segunda ida:
    	- Se uma lâmpada estiver acesa, ela está conectada ao terceiro interruptor
        - Se uma lâmpada estiver apagada, mas quente, ela está conectada ao segundo interruptor
        - Se uma lâmpada estiver apagada e fria, ela está conectada ao primeiro interruptor
</b>
5) Escreva um programa que inverta os caracteres de um string. 


IMPORTANTE: 

	a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código; 

	b) Evite usar funções prontas, como, por exemplo, reverse; 
