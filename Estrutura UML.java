@startuml

interface ReprodutorMusical {
  + tocar(): void
  + pausar(): void
  + selecionarMusica(musica: String): void
}

interface AparelhoTelefonico {
  + ligar(numero: String): void
  + atender(): void
  + iniciarCorreioVoz(): void
}

interface NavegadorInternet {
  + exibirPagina(url: String): void
  + adicionarNovaAba(): void
  + atualizarPagina(): void
}

class iPhone2025 {
  implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet

  // Implementação dos métodos da interface ReprodutorMusical
  + tocar(): void
  + pausar(): void
  + selecionarMusica(musica: String): void

  // Implementação dos métodos da interface AparelhoTelefonico
  + ligar(numero: String): void
  + atender(): void
  + iniciarCorreioVoz(): void

  // Implementação dos métodos da interface NavegadorInternet
  + exibirPagina(url: String): void
  + adicionarNovaAba(): void
  + atualizarPagina(): void
}

@enduml

