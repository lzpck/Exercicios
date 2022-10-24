import org.devinhouse.superherois.cli.Display;
import org.devinhouse.superherois.cli.Menu;
import org.devinhouse.superherois.cli.TipoPersonagem;
import org.devinhouse.superherois.exception.OpcaoInvalidaException;
import org.devinhouse.superherois.model.Personagem;
import org.devinhouse.superherois.repository.PersonagemRepository;

import java.util.List;

public class Programa {

    private Display display = new Display();
    private PersonagemRepository repo = new PersonagemRepository();

    public void executar(){
        Menu menu = null;
        while (menu != Menu.SAIR){
            display.exibirMenu();
            try {
                menu = display.obterOperacao();
                processar(menu);
            } catch (OpcaoInvalidaException e){
                display.exibirMensagem("Opção inválida!");
            }
        }
    }

    private void processar(Menu menu){
        switch (menu){
            case CADASTRAR_HEROI:
                Personagem heroi = display.cadastrar(TipoPersonagem.HEROI);
                repo.inserir(heroi);
                break;
            case CADASTRAR_VILAO:
                Personagem vilao = display.cadastrar(TipoPersonagem.VILAO);
                repo.inserir(vilao);
                break;
            case LISTAR:
                List<Personagem> personagens = repo.consultar();
                if (personagens.isEmpty()) {
                    display.exibirMensagem("Sem personagens cadastrados");
                }
                display.listar(personagens);
                break;
        }
    }
}
