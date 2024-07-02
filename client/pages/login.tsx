import type { NextPage } from "next";
import { useCallback, useMemo, useState } from "react";

import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';

const Login : NextPage = () => {
    const [password, setPassword] = useState('');
    const [email, setEmail] = useState('');

    const handleEmailChange = useCallback((event : any) => {
        setEmail(event.target.value);
    }, [])
    const handlePasswordChange = useCallback((event : any) => {
        setPassword(event.target.value);
    }, [])

    const handleSubmit = (event : any) => {
        event.preventDefault();
        alert(`Your state values: email: ${email} --- password: ${password}`)
    }

    const isEmailValid = useMemo(() => { console.log('rerere'); return email && email.length > 4; }, [email])

    return (
        <Form>
            <Form.Group>
                <Form.Label>Email Address</Form.Label>
                <Form.Control type='email' placeholder="Enter Registered Email..." onChange={handleEmailChange}/>
                {!isEmailValid ? <Form.Label>Please Enter Valid Email</Form.Label> : null}
            </Form.Group>
            <Form.Group>
                <Form.Label>Password</Form.Label>
                <Form.Control type='Password' placeholder="Enter Password..." onChange={handlePasswordChange}/>
            </Form.Group>
            <Button variant="info" onClick={handleSubmit}>Log In</Button>
        </Form>
    )
}

export default Login;