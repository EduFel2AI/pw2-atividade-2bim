public class UsuarioTeste {

    public static void main(String[] args) {
        Usuario novoUsuario = new Usuario();
        novoUsuario.setCodigo(1);
        novoUsuario.setNome("horacio.augusto");

        novoUsuario.setStatus(StatusUsuarioEnum.INATIVO);
        novoUsuario.exibirDados();
    }
}
