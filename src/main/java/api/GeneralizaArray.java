package api;

import java.util.*;

public class GeneralizaArray<T>{
    private final ArrayList<T> lista = new ArrayList<>();

    public boolean adiciona(T elemento){
        return lista.add(elemento);
    }

    public boolean retira(T elemento){
        return lista.remove(elemento);
    }

    public boolean verifica(T elemento){
        return lista.contains(elemento);
    }

    public T get(int posicao){
        return lista.get(posicao);
    }

    public int tamanho(){
        return lista.size();
    }

    public void adcionaEmGrupo(ArrayList<T> obj){
        for(T t: obj){
            adiciona(t);
        }
    }

    public ArrayList<T> getLista(){
        return new ArrayList<T>(lista);
    }
}
