#language: es

Característica: Abrir una pagina web

  Yo como alejandro
  Quiero realizar una prueba de ingreso
  Para comprobar que abre mi pagina web

  @authenticationLogin
  Escenario: Logueo en el portal web
    Dado El usuario quiere loguearse
    Cuando da click en continuar
      | user        | password |
      | AndreGarcia | 1234     |
    Entonces ingresa al portal