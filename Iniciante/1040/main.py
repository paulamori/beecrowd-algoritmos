nota1,nota2,nota3,nota4 = map(float,input().split())

media=(nota1*2+nota2*3+nota3*4+nota4*1)/10
print(f"Media: {media:.1f}")
if media>=7.0:
    print("Aluno aprovado.")
elif media<5.0:
    print("Aluno reprovado.")
else:
    print("Aluno em exame.")
    
    notaExame=float(input())
    print(f"Nota do exame: {notaExame:.1f}")
    media=(media+notaExame)/2
    if(media>=5.0):
        print("Aluno aprovado.")
    else:
         print("Aluno reprovado.")

    print(f"Media final: {media:.1f}")
