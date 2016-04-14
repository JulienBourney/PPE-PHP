<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class TestAuthentification extends CI_Controller {
    public function __construct()
    {
        parent::__construct();
        $this->load->model('Reservations_modele'); 
        $this->load->library('unit_test');
    }
    public function index(){
        
        $this->unit->run($this->Reservations_modele->checkAuthentification("test","test"),true,"testing function checkAuthentification");
        $this->unit->run($this->Reservations_modele->checkUser("test1")->Admin,1,"testing function checkUser with admin user");
        $this->unit->run($this->Reservations_modele->checkUser("test")->Admin,0,"testing function checkUser with normal user");      
        $this->unit->run($this->Reservations_modele->getIdUtilByLogin("test2"),27,"testing function getIdByLogin");
        $this->load->view('reservations/tests');
    }
}