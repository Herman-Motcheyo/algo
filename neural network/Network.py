from Function import *

'''
   this file contains full neural network
'''

class Network:

    def __init__(self , name ="Unknow", learn ="sigmoide", error =0.001):
        '''
           this method is constructor . it used to initialize Neural Network(NN)
           @params :
                name : it is name of NN by default Unknow
                learn: it is activation function . by default sigmoide
                error : represente learning error
        '''
        self.name = name
        #by default , many person write hyperbolic tangente by Tangente
        if 'tangente'== str.lower(learn):
            self.function_learn = tangente
            self.name_function_learn = 'tangente'
        else:
            self.function_learn = sigmoide
            self.name_function_learn = 'sigmoide'
        
        self.error = error 
        self.layer = [] # array of layer with number of neural by layer
        self.link = [] #array with all weigth(poid)
        self.values = [] #array of differents value of NN

        self.control = 0  

    def get_name(self):
        return self.name 

    def set_name(self , name):
        self.name = name

    def get_error(self):
        return self.error
    
    def set_error(self , error):
        if error >0 :
            self.error = error
        else:
            raise ValueError("eror must be positif")
    
    def set_function_learn(self , name):
        if (str.lower(name)=='tangente'):
            self.function_learn = tangente
            self.name_function_learn = 'tangente'
        else:
            self.function_learn = sigmoide
            self.name_function_learn = 'sigmoide'
    
    def get_name_function_learn(self):
        return self.name_function_learn
    
    def get_number_of_layer(self):
        return len(self.layer)

    def get_last_layer(self):
        return self.values[-1]

    def get_data(self): # return NN
        return [self.get_name() , self.get_name_function_learn() ,self.get_error() ,self.get_number_of_layer()]

    def set_layer(self , number):
        '''
           this method is use to initialse number of layer
           by default , we have to 2 layers :
                      enter layer and output
        '''
        if self.control ==0 :#check if network has never initialize
            if number >=2:
                for i in range(0, number):
                    self.layer.append(0)
            else:
                raise ValueError("network must have minimum 2 layers")
        else:
            raise ValueError("network has been created , you cannot modify it")

    def add_layer(self , position):
        '''
            this method is used to add a layer 
            @params
                position : this is the position that you need to add
        '''

        if self.control == 0:
            if(position >= 0 and position <len(self.layer)):
                self.layer.insert(position ,0)
            else:
                raise ValueError("You can add layer between [0 and" , len(self.layer) ," ]")
        else:
            raise ValueError("layer has been initialized")

    def add_neural(self , layer ,nbre =1):
        '''
            this method is used to add neural in layer
            by defauld , number of neural  is 1
        '''
        if self.control ==0:
            if (layer >=0 and layer <= len(self.layer) and nbre >0):
                self.layer[layer] += nbre
            else:
                raise ValueError("error layer position or number" ,layer , nbre )
        else:
            raise ValueError("network has been created , you cannot modify it")

    
    def add_all_neural(self ,arrays):
        '''
            for this method , i want to add all neural to every layer directly
            for this , 
            @params 
                arrays : first element contain number of layer to layer 1
        '''
        if self.control==0 :
            if(len(arrays)== len(self.layer)):
                for i in range(0,len(self.layer)):
                    self.add_neural(i , arrays[i])
            else:
                raise ValueError("Array must have same size layer", len(self.layer))
    

    def create_network(self):
        '''
            this method is use to initialise all connexion between neurals
            the (poids ) is put 0 by default
            we are going to create complet NN each neural is connected to every other neural layer i+1
            eventualy array of neural's value  at 0
        '''
        check = 0
        for i in range(0 , len(self.layer)):
            if (self.layer[i]  <= 0): #we check if every layer have minimun 1 neural
                print("layer",self.layer[i],"must contains (au moins) one neural")
                check = 1
        
        if check != 1 :
            if (self.control==0):
                self.control = 1
                for i in range(0 , len(self.layer)): #we create all connexion to every layer
                    add = []
                    add_link = []
                    add_values = []
                    for j in range(0 , self.layer[i]):
                        if (i != len(self.layer )-1):
                            for k in range(0, self.layer[i+1]):
                                add_link.append(0.5) #all poids with 0.5
                            add.append(add_link)
                            add_link = []
                        add_values.append(0)
                    if( i != len(self.layer)-1):
                        self.link.append(add)
                    self.values.append(add_values)
            else:
                raise  ValueError('NN is already initialize')
        else:
            ValueError("You can not launch l'initialization")