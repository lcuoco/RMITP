package rmi.cuoco.server.object;

import java.io.Serializable;

public class Message implements Serializable {
    private String contenu;
    private Utilisateur user;

    public Message(String contenu, Utilisateur user) {
        this.contenu = contenu;
        this.user = user;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }
}
