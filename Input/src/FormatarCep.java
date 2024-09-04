public class FormatarCep {
    public static void main(String[] args) {
        String cepFormatado;
        try {
            cepFormatado = formatarCep("23456767");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }

    static String formatarCep(String cep) throws CepInvalidoException{
    if (cep.length()!=8) {
        throw new CepInvalidoException();
    }
    return "23.234-234";
    }
}
    



