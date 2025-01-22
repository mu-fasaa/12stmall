
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderOrderMgntManager from "./components/listers/OrderOrderMgntCards"
import OrderOrderMgntDetail from "./components/listers/OrderOrderMgntDetail"

import SearchProdcutView from "./components/SearchProdcutView"
import SearchProdcutViewDetail from "./components/SearchProdcutViewDetail"
import DeliveryDeliveryManager from "./components/listers/DeliveryDeliveryCards"
import DeliveryDeliveryDetail from "./components/listers/DeliveryDeliveryDetail"

import ProductInventoryManager from "./components/listers/ProductInventoryCards"
import ProductInventoryDetail from "./components/listers/ProductInventoryDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders/orderMgnts',
                name: 'OrderOrderMgntManager',
                component: OrderOrderMgntManager
            },
            {
                path: '/orders/orderMgnts/:id',
                name: 'OrderOrderMgntDetail',
                component: OrderOrderMgntDetail
            },

            {
                path: '/orders/searchProdcuts',
                name: 'SearchProdcutView',
                component: SearchProdcutView
            },
            {
                path: '/orders/searchProdcuts/:id',
                name: 'SearchProdcutViewDetail',
                component: SearchProdcutViewDetail
            },
            {
                path: '/deliveries/deliveries',
                name: 'DeliveryDeliveryManager',
                component: DeliveryDeliveryManager
            },
            {
                path: '/deliveries/deliveries/:id',
                name: 'DeliveryDeliveryDetail',
                component: DeliveryDeliveryDetail
            },

            {
                path: '/products/inventories',
                name: 'ProductInventoryManager',
                component: ProductInventoryManager
            },
            {
                path: '/products/inventories/:id',
                name: 'ProductInventoryDetail',
                component: ProductInventoryDetail
            },



    ]
})
