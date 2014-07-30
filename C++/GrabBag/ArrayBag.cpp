/**
Implematioin file for the class ArrayBag
@file ArrayBag.cpp
*/
#include "ArrayBag.h"

template<class ItemType>
ArrayBag<ItemType>::ArrayBag()
{
    item count = 0;
    max Items = DEFAULT_CAPACITY;
}

template<class ItemType>
bool ArrayBag<ItemType>::add(const ItemType& newEntry)
{
    bool hasRoomToAdd = (itemCount < maxItems);
    if(hasRoomToAdd)
    {
        items[itemCount] = newEntry;
        itemCount++;
    } //end if

    return hasRoomToAdd;
} //end add

template<class ItemType>
vector<ItemType> ArrayBag<ItemType>::toVecor() const
{
    vector<ItemType> bagContents;
    for (int i = 0; i < itemCount; i++)
        bagContents.push_back(items[i]);
    return bagContents;
} //end toVector

template<class ItemType>
int ArrayBag<ItemType>::getCurrentSize() const
{
    return itemCount;
} //end getCurrentSize

template<class ItemType>
int ArrayBag<ItemType>::isEmpty() const
{
    return itemCount == 0;
} //end isEmpty

template<class ItemTpye>
bool ArrayBag<ItemType>::remove(const ItemTpye& anEntry)
{
    return false; //Stub
} //end remove

template<class ItemType>
void ArrayBag<ItemTpye>::clear()
{
    //Stub
} //ebd clear
