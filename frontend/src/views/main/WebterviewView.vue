<template>
  <WebterviewSidebar/>
  <!-- <MeetingRoomMan/> -->
  <router-view/> 
</template>

<script>
// import MeetingRoomMan from '@/components/MeetingRoomMan.vue'
import WebterviewSidebar from '@/components/WebterviewSidebar.vue'
import { mapActions, mapGetters } from 'vuex'

export default {
    name: 'WebterviewView',

    components: { WebterviewSidebar },
    data() {
        return {

        }
    },
    computed: {
      ...mapGetters(['email', 'userNo']),
      useremail() {
        return this.email
      },
    },
    methods: {
      ...mapActions(['fetchProfile', 'readGroup']),
      ...mapActions(['logout']),
    },
    created() {
    // const payload = { useremail: this.email}
    // this.fetchProfile(payload)

  },

}
</script>

<style scoped>
.dropbtn {
  position: fixed;
  top: 1%;
  right: 3%;
  background-color: #FFF;
  color: #F05454;
  padding: 16px;
  font-size: 16px;
  border: none;
  border-radius: 15px;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: fixed;
  top: 7%;
  right: 1%;
  background-color: #fff;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: gray;
  padding: 10px 10px 10px 10px;
  text-decoration: none;
  display: block;
  font-size:15px;
}

.dropdown-content a:hover {
  background-color: #ddd;
  color:#F05454;
  }

.dropdown:hover .dropdown-content {display: block;}

.dropdown:hover .dropbtn {
  background-color: #f5f5f5;
  color: #F05454;}
</style>