import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    /**
     * Map to store the agenda's data
     */
    private Map<String, Integer> agendaContatoMap;

    /**
     * Constructor
     */
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    /**
     * Method to put someone in the agenda
     *
     * @param nome     Name of the person, key of the map
     * @param telefone Telephone of the person, value of the map
     */
    public void adicionarContato(String nome, Integer telefone) {
        this.agendaContatoMap.put(nome, telefone);
    }

    /**
     * Remove one contact of the agenda based on his name
     * 
     * @param nome Name of the contact to be removed
     */
    public void removerContato(String nome) {
        if (! agendaContatoMap.isEmpty()) {
            this.agendaContatoMap.remove(nome);
        }
    }

    /**
     * Print agendaContatoMap
     */
    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    /**
     * Allow search a telephone based on a name
     * 
     * @param nome Name of the contact
     * @return The telephone associated to the received name
     */
    public Integer pesquisarPorNome(String nome) {
        if (! agendaContatoMap.isEmpty()) {
            return agendaContatoMap.get(nome);
        }
        return null;
    }

}
