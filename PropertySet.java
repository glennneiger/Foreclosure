/*
 Nick Soetaert

 A PropertySet represents the set of cards that forms from stacking
 one or more cards of the same color together.

 Parent: N/A
 Children: NormalPropertySet, NoHousePropertySet

*/
import java.util.ArrayList;
import java.util.List;

public abstract class PropertySet {
//	Represents all cards in a given stack, including properties, wild, and structures.
    protected List<Card> cardSet = new ArrayList<>();

//	Represents the possible rent prices that can apply to those cards.
    protected RentPrice _rentPrice;


//	Pre:	A propertyCard is being passed
//	Post:	A PropertySet is initialized
    PropertySet(PropertyCard card){
	_rentPrice = RentPriceObject;
    }


//	Function: Add a card to the given PropertySet object (PropertyCard or Structure)
//	Pre: A PropertySet has been initialized, and a Card is passed
//	Post: A card has been added to PropertySet
    public void addCard(Card newCard){
	cardSet.add(newCard);
    }

//	Removes a Card from PropertySet
    public void removeCard(Card oldCard){
	_currentPropertiesInSet--;
    }

    public int getFullSetSize(){
	return _rentPrice.getPropertyClass;
    }

    public int getRent(){
	return _rentPrice.getRent(_currentPropertiesInSet);
    }

}
