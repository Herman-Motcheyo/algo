from Function import *

'''
   this file contains full neural network
'''

class Network:

    def __init__(self , name ="Unknow", learn ="sigmoide", error =0.001):
        '''
           this method is constructor . it used to initialize Neural Network(NN)
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
        if errore >0 :
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



h= Network()
print(h.get_data())