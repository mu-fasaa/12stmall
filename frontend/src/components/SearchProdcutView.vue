<template>

    <v-data-table
        :headers="headers"
        :items="searchProdcut"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SearchProdcutView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            searchProdcut : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/searchProdcuts'))

            temp.data._embedded.searchProdcuts.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.searchProdcut = temp.data._embedded.searchProdcuts;
        },
        methods: {
        }
    }
</script>

