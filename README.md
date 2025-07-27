# ❄️ WinterBreak Project - Git & GitHub Didactic Exercise

## 👤 Candidato

**Antonio Pepe**  
**Matricola:** FB016A00022  
**Classe di concorso:** B016 - Laboratori di Scienze e Tecnologie Informatiche

---

## 📌 Traccia

> Si progetti la lezione anche mediante tecnologie digitali multimediali, sviluppandola con didattica innovativa e accompagnandola con l'illustrazione delle scelte contenutistiche, didattiche e metodologiche compiute in riferimento al percorso di formazione iniziale relativo alla specifica classe di concorso.

---

## 🧑‍💻 Oggetto della Traccia

Realizzazione di un’esercitazione didattica su **Git e GitHub** rivolta a una classe 4D di un Istituto Tecnico Industriale (I.T.I. Renato Elia), con l’obiettivo di introdurre il **controllo versione** attraverso approcci didattici innovativi e laboratoriali.

---

## 🔧 Comandi Fondamentali Git

| Comando                      | Descrizione                                                  |
|-----------------------------|--------------------------------------------------------------|
| `git init`                  | Inizializza un nuovo repository Git locale                   |
| `git config --global user.name "<TUO_USERNAME>"` | Configura il nome utente Git         |
| `git config --global user.email "<TUA_EMAIL>"`   | Configura l’email Git                |
| `git add .`                 | Aggiunge tutte le modifiche all’area di staging              |
| `git commit -m "Messaggio"` | Registra le modifiche con un messaggio                      |
| `git push origin main`      | Invia i commit al repository remoto                         |
| `git pull origin main`      | Sincronizza il repository locale con il remoto              |
| `git clone <url>`           | Clona un repository remoto                                  |
| `gh auth login`             | Effettua login con GitHub CLI                               |
| `gh repo create ...`        | Crea un nuovo repository GitHub da console                  |

---

## ⚙️ Creazione Progetto Java/Maven

Per creare un progetto console in Java con Maven:

```bash
mvn archetype:generate \
  -DgroupId=org.example \
  -DartifactId=winterbreak-prj-locale \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DinteractiveMode=false

cd winterbreak-prj-locale
```
---

## 🛠️ Setup iniziale GitHub

Dopo aver creato il progetto locale:

```bash
# 1. Inizializza Git
git init

# 2. Configura le credenziali globali (solo la prima volta)
git config --global user.name "Antonio Pepe"
git config --global user.email "tuamail@example.com"

# 3. Crea repo GitHub e collega il progetto locale
gh repo create tec-ant/winterbreak-prj --public --source=. --remote=origin --push

# 4. Aggiungi un .gitignore
# Puoi generarlo con: https://www.toptal.com/developers/gitignore
```

---

## 🌐 Link utili

* [Profilo GitHub Antonio Pepe (tec-ant)](https://github.com/tec-ant)
* [Download Git](https://git-scm.com)
* [GitHub CLI (gh)](https://cli.github.com/)
* [Linee guida MIUR Informatica](https://www.e-santoni.org/Linee_guida/secondo_ciclo/tecnici_linee_guida/linee_guida_triennio/Linee_guida_Istituti_Tecnici_secondo_biennio_e_quinto_anno.pdf)

---

## 🎓 Obiettivi Didattici

* Comprendere il funzionamento di Git e GitHub
* Creare e versionare un progetto locale
* Collaborare tramite GitHub
* Lavorare in modalità flipped classroom e cooperative learning
* Sviluppare codice e presentazioni multimediali in team

---

> *"L’apprendimento deve essere occasione di divertimento, un’esperienza piacevole, coinvolgente e appassionante."* — *Paul Freire*
