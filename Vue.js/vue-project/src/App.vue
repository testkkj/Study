<template>
  <div id="nav">
    <router-link to="/">Home</router-link> | 
    <router-link to="/about">About</router-link> | 
    <router-link to="/databinding">Data Binding</router-link> | 
    <router-link to="/databindinghtml">Data Binding Html</router-link> | 
    <router-link to="/databindinginputtext">Data Binding Input Text</router-link> | 
    <router-link to="/databindinginputnumber">Data Binding Input Number</router-link> | 
    <router-link to="/databindingtextarea">Data Binding Textarea</router-link> | 
    <router-link to="/databindingselect">Data Binding Select</router-link> | 
    <router-link to="/databindingcheckbox">Data Binding Checkbox</router-link> | 
    <router-link to="/databindingattribute">Data Binding Attribute</router-link> | 
    <router-link to="/databindingbutton">Data Binding Button</router-link> | 
    <router-link to="/databindingclass">Data Binding Class</router-link> | 
    <router-link to="/databindingclass2">Data Binding Class2</router-link> | 
    <router-link to="/databindingstyle">Data Binding Style</router-link> | 
    <router-link to="/databindinglist">Data Binding List</router-link> | 
    <router-link to="/renderingvif">Rendering V-if</router-link> | 
    <router-link to="/eventclick">Event Click</router-link> | 
    <router-link to="/eventchange">Event Change</router-link> | 
    <router-link to="/computed">Computed</router-link> | 
    <router-link to="/watch">Watch</router-link> | 
    <router-link to="/databindinglist2">Data Binding List2</router-link> | 
    <router-link to="/nestedcomponent">Nested Component</router-link> | 
    <router-link to="/parentcomponent">Parent Component</router-link> | 
    <router-link to="/parentcomponent2">Parent Component2</router-link> | 
    <router-link to="/parentcomponent3">Parent Component3</router-link> | 
    <router-link to="/parentcomponent4">Parent Component4</router-link> | 
    <router-link to="/parentcomponent5">Parent Component5</router-link>
  </div>
  <router-view/>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  width: 60%;
  margin-left: 20%;
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
