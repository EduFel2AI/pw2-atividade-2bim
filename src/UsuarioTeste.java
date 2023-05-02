public class UsuarioTeste {

    public static void main(String[] args) {
        Usuario novoUsuario = new Usuario();
        novoUsuario.setCodigo(1);
        novoUsuario.setNome("horacio.augusto");
        novoUsuario.setSenha("etec#123");

        novoUsuario.setStatus(StatusUsuarioEnum.ATIVO);

        novoUsuario.exibirDados();
        System.out.println(novoUsuario.autenticar("etec#"));
    }
}
