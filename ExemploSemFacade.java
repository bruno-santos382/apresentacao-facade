// SEM FACADE - Complexo e repetitivo
public class ExemploSemFacade {
    public static void main(String[] args) {
        new UsuarioSemFacade();
        new TecnicoSemFacade();
    }
}

class UsuarioSemFacade {
    
    public UsuarioSemFacade() {
        System.out.println("\n=== Inicializando Usuário ===");

        // Cliente gerencia todos os subsistemas
        Fonte fonte = new Fonte();
        PlacaMae placaMae = new PlacaMae();
        Processador cpu = new Processador();
        Memoria ram = new Memoria();
        GPU gpu = new GPU();
        
        // Cliente precisa conhecer a sequência correta de inicialização
        fonte.ligar();
        placaMae.inicializar();
        cpu.inicializar();
        ram.verificarMemoria();
        gpu.inicializarGraficos();
    }
}

class TecnicoSemFacade {
    
    public TecnicoSemFacade() {
        System.out.println("\n=== Inicializando Técnico ===");

        // Mesmo código repetido - cliente gerencia todos os subsistemas
        Fonte fonte = new Fonte();
        PlacaMae placaMae = new PlacaMae();
        Processador cpu = new Processador();
        Memoria ram = new Memoria();
        GPU gpu = new GPU();
        
        // Mesmo conhecimento técnico necessário
        fonte.ligar();
        placaMae.inicializar();
        cpu.inicializar();
        ram.verificarMemoria();
        gpu.inicializarGraficos();
    }
}
