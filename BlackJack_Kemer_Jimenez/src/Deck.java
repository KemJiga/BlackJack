
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kemer
 */
public class Deck {

    private ArrayList<Card> cards;
    private Nodo ptr;

    class Nodo {

        Card card;
        Nodo Link;
    }

    Nodo addCard(Nodo ptr, Card card) {
        Nodo p = ptr;
        Nodo q = new Nodo();
        q.card = card;
        if (ptr == null) {
            ptr = q;
            q.Link = ptr;
        } else {
            while (p.Link != ptr) {
                p = p.Link;
            }
            p.Link = q;
            q.Link = ptr;
        }
        return ptr;
    }

    void removeCard(Nodo ptr, Card card) {
        Nodo p = ptr;
        Nodo anteP = null;
        boolean evaluated = false;

        if ((p.card).equals(card)) {
            evaluated = true;
        } else {
            anteP = p;
            p = p.Link;
        }

        while (!(p.card).equals(card) && !evaluated) {
            anteP = p;
            p = p.Link;
        }

        if (evaluated) {
            ptr = ptr.Link;
        } else if ((p.card).equals(card)) {
            anteP.Link = p.Link;
        }
    }

    private void showList() {
        Nodo p = ptr;
        do {
            System.out.println(p.card.toString());
            p = p.Link;
        } while (p != ptr);
    }

    public Deck() {
        //Nuevo mazo
        this.cards = new ArrayList<Card>();
        ptr = null;
    }

    //Agregar las 52 cartas
    public void createFullDeck() {
        //Generarlas e ir entre suit y values
        for (Suit cardSuit : Suit.values()) {
            for (Value cardValue : Value.values()) {
                //Agregarlas
                this.cards.add(new Card(cardSuit, cardValue));
                ptr = addCard(ptr, new Card(cardSuit, cardValue));
            }
        }
    }

    //Mezclarlas
    public void shuffle() {
        //Una temporal para mantenerlas antes de regresarlas
        ArrayList<Card> tmpDeck = new ArrayList<Card>();
        Nodo ptrTemp = null;
        //coger una random y agregarla al temporal
        Random random = new Random();
        int randomCardIndex = 0;
        int originalSize = this.cards.size();
        for (int i = 0; i < originalSize; i++) {
            randomCardIndex = random.nextInt((this.cards.size() - 1 - 0) + 1) + 0;
            //agregarla al mazo temporal
            tmpDeck.add(this.cards.get(randomCardIndex));
            ptrTemp = this.addCard(ptrTemp, this.cards.get(randomCardIndex));
            //removerla de anterior
            this.cards.remove(randomCardIndex);
        }
        //hacer que el temporal sea el mazo original
        this.cards = tmpDeck;
        ptr = ptrTemp;
    }

    //Remover una carta
    public void removeCard(int i) {
        this.cards.remove(i);
    }

    //Obtener una del mazo
    public Card getCard(int i) {
        return this.cards.get(i);
    }

    //Agregar una del mazo
    public void addCard(Card addCard) {
        this.cards.add(addCard);
    }

    //Tomar la primera carta del mazo
    public void draw(Deck comingFrom) {
        //Agregarla al mazo (mano) del jugador o repartidor
        this.cards.add(comingFrom.getCard(0));
        //Removerla del mazo fuente
        comingFrom.removeCard(0);
    }

    //Imprime las cartas en formato lista
    @Override
    public String toString() {
        String cardListOutput = "";
        int i = 0;
        for (Card aCard : this.cards) {
            cardListOutput += "\n" + aCard.toString();
            i++;
        }
        return cardListOutput;
    }

    public void moveAllToDeck(Deck moveTo) {
        int thisDeckSize = this.cards.size();
        //Mover cartas de un mazo a otro
        for (int i = 0; i < thisDeckSize; i++) {
            moveTo.addCard(this.getCard(i));
        }
        //vaciar mazo
        for (int i = 0; i < thisDeckSize; i++) {
            this.removeCard(0);
        }
    }

    public int deckSize() {
        return this.cards.size();
    }

    //Calcula el valor de un mazo
    public int cardsValue() {
        int totalValue = 0;
        int aces = 0;
        //Para cada carta en el mazo
        for (Card aCard : this.cards) {
            switch (aCard.getValue()) {
                case DOS:
                    totalValue += 2;
                    break;
                case TRES:
                    totalValue += 3;
                    break;
                case CUATRO:
                    totalValue += 4;
                    break;
                case CINCO:
                    totalValue += 5;
                    break;
                case SEIS:
                    totalValue += 6;
                    break;
                case SIETE:
                    totalValue += 7;
                    break;
                case OCHO:
                    totalValue += 8;
                    break;
                case NUEVE:
                    totalValue += 9;
                    break;
                case DIES:
                    totalValue += 10;
                    break;
                case JACK:
                    totalValue += 10;
                    break;
                case QUEEN:
                    totalValue += 10;
                    break;
                case KING:
                    totalValue += 10;
                    break;
                case AZ:
                    aces += 1;
                    break;
            }
        }

        //Dependiendo la situacion, un AZ puede valor 1 u 11
        //se toma la cantidad de aces y se evalua el total de la mano actual
        for (int i = 0; i < aces; i++) {
            //si supera 10 es mejor que valga 1
            if (totalValue > 10) {
                totalValue += 1;
            } else { //si es mejor a 10 mejor que valga 11
                totalValue += 11;
            }
        }
        return totalValue;
    }
}
