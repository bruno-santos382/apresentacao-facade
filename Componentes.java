// Classes dos subsistemas
class Fonte {
    public void ligar() {
        System.out.println("Fonte: Fornecendo energia ao sistema");
    }
}

class PlacaMae {
    public void inicializar() {
        System.out.println("Placa Mãe: Inicializando componentes");
    }
}

class Processador {
    public void inicializar() {
        System.out.println("Processador: Iniciando processamento");
    }
}

class Memoria {
    public void verificarMemoria() {
        System.out.println("Memória: Verificando e carregando dados");
    }
}

class GPU {
    public void inicializarGraficos() {
        System.out.println("GPU: Inicializando sistema gráfico");
    }
}
