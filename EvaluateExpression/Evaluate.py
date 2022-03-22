class Evaluation :

    str_expression =""

    def __init__(self , exp):
        self.str_expression = exp

    def evaluateExpression(self):
        operande = []
        operateur = []

        if str_expression =="":
            raise ValueError("expression must be different of null")
        
        for x in str_expression :
            if x =='(':
                operateur.append('(')
            elif x=='+':
                operateur.append('+')
            elif x == '-':
                operateur.append('-')
            elif x == '/':
                operateur.append('/')
            elif x == '*':
                operateur.append('*')
            elif x ==')':
                while 
    
    @classmethod
    def operation(self , a , b ,exp):

        if exp =='+':
            return a+b
        if exp == '-':
            return a-b
        if exp == '*':
            return a*b
        if exp == '/' :
            return a/b
        
        raise Exception("Enter valid expression")