import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vite.dev/config/
export default defineConfig({
  plugins: [react()],
  server: {
    host: '0.0.0.0', // Permitir conexões externas
    port: 5173,       // Ou qualquer outra porta que você prefira
  },
})
