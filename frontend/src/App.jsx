import { useState } from 'react'
import Navigation from './Navigation'
import Home from './Home'
import AboutServices from './AboutServices'
import CustomOrderRequest from './CustomOrderRequest'
import Contact from './Contact'

const SECTIONS = [
  { key: 'home', label: 'Home' },
  { key: 'about', label: 'About/Services' },
  { key: 'order', label: 'Custom Order Request (Egyedi ajánlatkérés)' },
  { key: 'contact', label: 'Contact' },
]

function App() {
  const [activeSection, setActiveSection] = useState('home')

  return (
    <>
      <Navigation sections={SECTIONS} activeSection={activeSection} onNavigate={setActiveSection} />
      {activeSection === 'home' && <Home />}
      {activeSection === 'about' && <AboutServices />}
      {activeSection === 'order' && <CustomOrderRequest />}
      {activeSection === 'contact' && <Contact onNavigate={setActiveSection} />}
    </>
  )
}

export default App
