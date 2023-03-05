package com.example.firstapp.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun addShopIte(shopItem: ShopItem){
        shopListRepository.addShopItem(shopItem)
    }
}