# Maraton Git 2026-1

## Integrantes 
- David Shadday Correa Gonzalez
- Mariana Malagon Tochoy
  Hoja de vida (presentación clase):
  <img width="589" height="628" alt="image" src="https://github.com/user-attachments/assets/073fef8d-6f00-4a0d-9af5-44e34d8b440f" />



---


## Retos completados

### Reto 1: Configuración y creación de rama
**Evidencia:**
<img width="1367" height="727" alt="image" src="https://github.com/user-attachments/assets/87d6e021-5d14-4f8e-9f00-af475e431eeb" />

**Descripción:**
Breve explicación del proceso realizado para configurar el repositorio y crear una nueva

A la debida creación del repositorio, permitiendo archivo README, se añadieron los integrantes y con GitBash recurrimos a crear cada uno de los integrantes una rama con el formato feature/ApellidoNombre_2026-1.



### Reto 2: Commit colaborativo
**Evidencia:**
<img width="1301" height="593" alt="image" src="https://github.com/user-attachments/assets/5fa8c226-5c9c-4ace-9e20-df27e4bb375a" />
<img width="952" height="660" alt="image" src="https://github.com/user-attachments/assets/06a93da9-9fa3-48d5-9da6-07846ece1095" />

**Descripción:**
Cada integrante después de realizar su propia rama, realizó sus cambios en ella misma, y mediante uso de comandos como git push, git pull y git merge. Se relizaron varios pull requests y también cambios efectuados en develop

### Retos de la Hackaton:

### RETO #1: La Bienvenida:
En este reto usamos una expresión lambda para imprimir un saludo de bienvenida con los nombres de nosotros, nuestra edad, correo y semestre.
Usamos lo requerido, stream(), map() y collect().
Este es el resultado:
<img width="1278" height="75" alt="image" src="https://github.com/user-attachments/assets/06cb280c-99cf-4e50-979d-457c1ad2259c" />

### Reto 2:
### RETO #2: Carrera en Paralelo  
La historia de los commits para el reto dos:
<img width="1129" height="315" alt="image" src="https://github.com/user-attachments/assets/dca52883-b3e0-4c40-a685-44450d2a9448" />

### Reto 3:
### RETO #3: El eco misterioso:
Para este reto, primero cada estudiante hizo lo requerido, el primero una función que repitiera el mensaje tres veces, y el segundo una función que inviertiera la frase:
Estudiante B:
<img width="876" height="38" alt="image" src="https://github.com/user-attachments/assets/eb488634-bb37-49c9-a3fd-5cd5f9d24792" />

Ambos le pusimos el mismo nombre a la función para tener conflictos al hacer merge, nos salió este conflicto:
<img width="1141" height="82" alt="image" src="https://github.com/user-attachments/assets/a835921f-61c4-46f9-98dd-a66a0d9b7c78" />
Entonces lo solcionamos mezclando los métodos que cada uno hizo en un método, también juntando la clase que hicimos igual y el resultado fue este:
<img width="881" height="40" alt="image" src="https://github.com/user-attachments/assets/56c53334-c654-476c-9034-105b540b3e72" />


### Reto 4:
### RETO #4: El tesoro de las llaves duplicadas  
En este reto cuando cada uno realizo su mètodo correspondiente, hicimos merge y tuvimos conflicto:
<img width="547" height="45" alt="image" src="https://github.com/user-attachments/assets/27d92e91-b3cd-44eb-b92e-401900572ec6" />

Arreglamos el conflicto unificando en una clase los mètodos de los dos y añadiendo
los otros dos mètodos que pedìan y volviendo a hacer merge, quedò la funciòn final y este es el resultado cumpliendo los requisitos:
<img width="972" height="113" alt="image" src="https://github.com/user-attachments/assets/b22fc8f8-02aa-4916-8fbd-49adb6a35506" />


### Reto 5:
### RETO #5: Batalla de Conjuntos  
Para este reto iniciamos cada uno realizando nuestra tarea en cada rama, luego de esto hicimos un merge en el que tuvimos que solucionar conflictos y añadiendole el metodo que juntara ambas colecciones y quitara duplicados.
El conflicto:
<img width="637" height="43" alt="image" src="https://github.com/user-attachments/assets/f9b34aa5-8b21-4340-9f9c-184b95c581c9" />

El resultado:
<img width="1052" height="146" alt="image" src="https://github.com/user-attachments/assets/b1ec4c18-4626-4cf4-8fce-5990673effce" />

### Reto 6:
### RETO #6: La máquina de decisiones 
En este reto cada uno hizo su respectivo fragmento del manual, tuvimos problemas en el merge ya que habìamos realizado de diferente manera el manual, este fue el problema:
<img width="987" height="50" alt="image" src="https://github.com/user-attachments/assets/56ce0e29-f884-4e08-a1e3-96e38f0046e1" />


Lo resolvimos unificandolo de la misma manera, cumpliendo los requisitos y el resultado fue el siguiente, dejando algunos comandos como ejemplos:
<img width="1058" height="121" alt="image" src="https://github.com/user-attachments/assets/86a3b9cb-af43-453f-8ca8-988caf42cda9" />


___

## Preguntas teóricas
1. ¿Cuál es la diferencia entre git merge y git rebase?
Merge combina los historiales de dos ramas conservando los commits originales, generando un commit de merge; rebase "reaplica" tus commits sobre otra rama, dejando un historial lineal.


2. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?  ===

Si dos ramas modifican la misma línea, Git marca un conflicto que debes resolver manualmente antes de completar el merge.

3. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola? = ==

Con git log --graph --oneline --all puedes ver ramas y merges de forma visual en texto.

4. Explica la diferencia entre un commit y un push.  === Commit guarda cambios localmente en tu repositorio; push envía esos commits al repositorio remoto.

5. ¿Para qué sirven git stash y git pop? === Stash guarda temporalmente cambios sin hacer commit,  pop aplica esos cambios nuevamente y los elimina del stash.

6. ¿Qué diferencia hay entre HashMap y HashTable? === HashMap no es sincronizado y permite null como clave, Hashtable es sincronizado y no permite claves ni valores null.

7. ¿Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa? ===  
Collectors.toMap() ofrece claridad y concisión al llenar mapas declarativamente, permite paralelismo con parallelStream(), gestiona claves duplicadas de forma elegante y se integra directamente con streams.

8. Si usas List con objetos y luego aplicas stream().map(), ¿qué tipo de operación estás haciendo? ===  
Estoy realizando una operación de transformación, aplicando una función a cada elemento de la lista para generar un nuevo stream con los resultados.

9. ¿Qué hace el método stream().filter() y qué retorna? ===  
Aplica un predicado para filtrar elementos de un stream según una condición y retorna un nuevo stream con los elementos que cumplen el predicado.

10. Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva. ===  
- Asegúrate de estar en la rama develop: git checkout develop.  
- Actualiza develop opcional: git pull origin develop.  
- Crea la rama con estándar feature/: git checkout -b feature/nueva-funcionalidad.  
- Verifica que estás en la nueva rama: git branch.

11. ¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b? ===  
git branch solo crea la rama, pero no te mueve a ella. git checkout -b crea la rama y te mueve a ella en un solo paso.

12. ¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente? ===  
Trabajar en ramas feature/ permite desarrollar de forma aislada, protege la rama main de errores, facilita la colaboración y mantiene un flujo de trabajo limpio y organizado.

**Acuerdos Mariana:**
1. **Distribución de responsabilidades** ===  
Planeabamos dividirnos, pero como los puntos era de mucha interacción estuvimos haciendolos juntos al tiempo, entonces en cuanto a distribución fue la misma.


3. **Forma de comunicación** ===  
La comunicación fue en WhatsApp para acordar las llamadas que se realizaron en Discord.
4. **Frecuencia de trabajo** ===  
Trabajamos 2 días maso menos 2 horas en la noche y lo que se adelanta en el lab.

5. **Manejo de conflictos y desacuerdos** ===  
No hubo conflictos, pero en caso de haber en un futuro se resolverán de la manera adecuada y respetuosa.

6. **Compromisos frente a entregas y calidad** ===  
Cumplir con fechas de entrega, asegurar calidad mediante buenas prácticas de desarrollo e informar a tiempo sobre posibles retrasos.
=======

