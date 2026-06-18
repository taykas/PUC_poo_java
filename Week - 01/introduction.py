import time

def calculate_price(ticket_type):
    if ticket_type == "estudante":
        return 10
    elif ticket_type == "professor":
        return 15
    else:
        return print("Tipo não reconhecido.")
    
total_tickets = 100
sold_tickets = 0

while sold_tickets < total_tickets:

    print(f"Tickets disponíveis: {total_tickets - sold_tickets}\n")

    try:
        qtd = int(input("Quantos ingressos deseja?\n-> "))
    except ValueError:
        print("Quantidade inválida!, tente novamente!")

    if sold_tickets >= total_tickets:
        print("Quantidade excede tickets disponíveis!")
    else:
        try:
            type = input("Qual o tipo de ingresso? (estudante - professor):\n-> ")

            confirm = input(f"\n{qtd} ingresso(os) R${qtd * calculate_price(type)}\nConfirma a compra? (sim - não)\n-> ")
        except ValueError:
            print("Valor inválido!")
    
    if confirm.lower() == "sim":
        sold_tickets += qtd

        print(f"Obrigada pela compra!\n")

        time.sleep(2)
        print("\033c", end="")
    else:
        print("Redirecionando para o menu\n")
    


