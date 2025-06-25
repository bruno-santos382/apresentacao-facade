# Design Pattern: FACADE  
**Apresentação sobre o padrão de projeto Facade**  
*Bruno Alexander e Gabriel Victorino*  

---

## Introdução  
### Do jeito fácil  
Quando vamos assistir a um filme ou ligar um computador, realizamos ações simples para atingir nosso objetivo. Por exemplo, para ligar um computador, apertamos um botão; para assistir a um filme, selecionamos o filme e clicamos no respectivo botão. Toda a complexidade por trás dessas ações é abstraída.  

### Do jeito técnico  
O padrão Facade é um padrão de design estrutural que fornece uma interface simplificada para interações complexas em sistemas. Ele atua como um intermediário, facilitando a comunicação com subsistemas complexos e permitindo que os desenvolvedores se concentrem em interações de nível superior.  

---

## Contextualização na área de software  
No contexto da programação, o padrão Facade é frequentemente utilizado em aplicações que envolvem múltiplas camadas e serviços. Ele permite a criação de uma interface unificada para interações complexas, simplificando a implementação, a manutenção do código e melhorando a legibilidade.  

---

## Problema  
### Tipo de problema que o padrão Facade resolve  
O padrão Facade é utilizado para resolver a complexidade e a dificuldade de interação com sistemas compostos por múltiplos subsistemas. Ele simplifica o uso de interfaces complexas, promovendo melhor usabilidade e reduzindo o acoplamento entre classes.  

### Exemplo de problema vs. solução  
**Problema:** Publicar um artigo envolve várias ações nos bastidores, como salvar no banco de dados, enviar notificações, atualizar o cache e registrar logs. Sem o padrão Facade, o código precisa lidar diretamente com cada um desses processos, tornando a implementação mais complexa e difícil de manter.  

**Solução:** O Facade fornece uma interface única para todas essas operações, simplificando o processo.  

---

## Linguagens e frameworks beneficiados  
- **Laravel (PHP):** Facades (ex.: Cache, DB, Auth) oferecem interfaces estáticas para serviços subjacentes.  
- **Spring Data JPA (Java):** Repositórios oferecem uma interface de alto nível para operações no banco sem escrever SQL/JPA.  

---

## Vantagens e Desvantagens  
### ✅ Vantagens  
- **Interface Simplificada:** Facilita o uso, escondendo a complexidade do subsistema.  
- **Manutenção e Refatoração:** Mudanças no subsistema não afetam os clientes, pois interagem apenas com a Facade.  
- **Boas Práticas:** Promove abstração, modularidade e organização do código.  

### ⚠️ Desvantagens  
- **Flexibilidade Limitada:** A interface simplificada pode ser rígida para necessidades específicas.  
- **Complexidade Crescente:** A Facade pode ficar grande e obscura com o tempo.  
- **Dependência da Facade:** Clientes ficam acoplados à Facade, dificultando mudanças futuras.  

---

## Conclusões  
O padrão Facade simplifica sistemas complexos através de uma interface unificada, transformando múltiplas operações em chamadas simples e organizadas.  

**Quando usar:**  
✅ Sistemas com múltiplos subsistemas interdependentes  
✅ Interfaces muito complexas para o cliente  
✅ Necessidade de baixo acoplamento entre camadas  

**Quando evitar:**  
⚠️ Sistemas já naturalmente simples  

---

