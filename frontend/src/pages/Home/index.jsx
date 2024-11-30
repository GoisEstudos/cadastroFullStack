import "./style.css";
import api from "../../services/api";
import { useEffect, useState, useRef } from "react";

function Home() {
  const [users, setUsers] = useState([])

  const inputNome = useRef()
  const inputIdade = useRef()
  const inputEmail = useRef()

  async function getUsers() {
    const userApi = await api.get("usuario");
    setUsers(userApi.data)
  }

  async function createUsers() {
    await api.post("usuario", {
      nome: inputNome.current.value,
      idade: inputIdade.current.value,
      email: inputEmail.current.value
    });

  }

  useEffect(() => {
    getUsers();
  }, []);

  return (
    <div className="conteiner">
      <form>
        <h1>Cadastro Usuario</h1>
        <input placeholder="Nome" name="nome" type="text" ref={inputNome}/>
        <input placeholder="Idade" name="idade" type="number" ref={inputIdade}/>
        <input placeholder="Email" name="email" type="email" ref={inputEmail}/>
        <button type="button" onClick={createUsers}>Cadastrar</button>
      </form>
    </div>
  );
}

export default Home;
