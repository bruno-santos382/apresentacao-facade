// COM FACADE - Simples e limpo
public class ComputadorFacade {
   private PlacaMae placaMae;
   private GPU gpu;
   private Memoria memoria;
   private Fonte fonte;
   private Processador processador;
   
   public ComputadorFacade() {
       // Facade instancia e gerencia todos os subsistemas
       this.fonte = new Fonte();
       this.placaMae = new PlacaMae();
       this.processador = new Processador();
       this.memoria = new Memoria();
       this.gpu = new GPU();
   }
   
   public void ligar() {
       // Facade orquestra a sequência complexa de inicialização
       fonte.ligar();
       placaMae.inicializar();
       processador.inicializar();
       memoria.verificarMemoria();
       gpu.inicializarGraficos();
   }
}


public class UsuarioComFacade {
    
    public UsuarioComFacade() {
        // Muito mais simples
        Computador computador = new ComputadorFacade();
        computador.ligar();
    }
}

public class TecnicoComFacade {
    
    public TecnicoComFacade() {
        // Mesmo código simples
        Computador computador = new ComputadorFacade();
        computador.ligar();
    }
}