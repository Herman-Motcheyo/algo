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
       
            self.name_function_learn = 'tangente'
        else:
         
            self.name_function_learn = 'sigmoide'
        
        self.error = error 
        self.layer = [] # array of layer with number of neural by layer
        self.link = [] #array with all weigth(poid)
        self.values = [] #array of differents value of NN

        self.control = 0  



