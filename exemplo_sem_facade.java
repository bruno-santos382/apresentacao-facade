// SEM FACADE - Complexo e repetitivo
public class UsuarioSemFacade {
    
    public UsuarioSemFacade() {
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

public class TecnicoSemFacade {
    
    public TecnicoSemFacade() {
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
