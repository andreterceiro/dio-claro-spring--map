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

    /**
     * Return a string representation of one object of this class based on its values
     *
     * @return A string representation of one object of this class based on its values
     */
    public String toString() {
        String ret = "{";
        for (Map.Entry<String, Integer> item : agendaContatoMap.entrySet()) {
            ret = ret + item.getKey() + ":" + item.getValue() + ", ";
        }
        // Removing the last comma and space
        if (agendaContatoMap.size() != 0) {
            ret = ret.substring(0, ret.length() - 2);
        }
        ret = ret + "}";
        return ret;
    }

    /**
     * Main method to manual tests
     * 
     * @param args Arguments passed through CLI (ignored)
     */
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        System.out.println(agendaContatos);

        agendaContatos.adicionarContato("André", 1);
        agendaContatos.adicionarContato("Júlio", 2);
        agendaContatos.adicionarContato("Fátima", 3);
        agendaContatos.adicionarContato("Thais", 0);
        // The method adicionarContato internally uses the put method of a hashmap
        // This method updates a value based on the key passed instead of ignoring
        agendaContatos.adicionarContato("Thais", 4);
        System.out.println(agendaContatos);

        // See in the output that the map mantain the relation with the key that was added, but is unordered

        System.out.println(agendaContatos.pesquisarPorNome("Fátima"));

        agendaContatos.removerContato("Thais");
        System.out.println(agendaContatos);

        agendaContatos.exibirContatos();
    }

}
